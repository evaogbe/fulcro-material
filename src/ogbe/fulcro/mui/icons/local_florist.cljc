(ns ogbe.fulcro.mui.icons.local-florist
  #?(:cljs (:require
            ["@mui/icons-material/LocalFlorist" :default LocalFlorist]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-florist
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalFlorist)))