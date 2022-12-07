(ns ogbe.fulcro.mui.icons.shield
  #?(:cljs (:require
            ["@mui/icons-material/Shield" :default Shield]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shield
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Shield)))