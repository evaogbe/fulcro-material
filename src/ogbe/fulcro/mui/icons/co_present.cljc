(ns ogbe.fulcro.mui.icons.co-present
  #?(:cljs (:require
            ["@mui/icons-material/CoPresent" :default CoPresent]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-co-present
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CoPresent)))