(ns ogbe.fulcro.mui.navigation.breadcrumbs
  #?(:cljs (:require
            ["@mui/material/Breadcrumbs" :default Breadcrumbs]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-breadcrumbs #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory Breadcrumbs)))
