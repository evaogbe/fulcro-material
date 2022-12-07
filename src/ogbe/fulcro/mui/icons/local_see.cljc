(ns ogbe.fulcro.mui.icons.local-see
  #?(:cljs (:require
            ["@mui/icons-material/LocalSee" :default LocalSee]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-see
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalSee)))