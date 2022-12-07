(ns ogbe.fulcro.mui.icons.router
  #?(:cljs (:require
            ["@mui/icons-material/Router" :default Router]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-router
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Router)))