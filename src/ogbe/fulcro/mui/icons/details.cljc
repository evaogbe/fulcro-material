(ns ogbe.fulcro.mui.icons.details
  #?(:cljs (:require
            ["@mui/icons-material/Details" :default Details]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-details
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Details)))