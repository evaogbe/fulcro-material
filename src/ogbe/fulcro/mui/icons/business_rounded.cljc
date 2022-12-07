(ns ogbe.fulcro.mui.icons.business-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BusinessRounded" :default BusinessRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-business-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BusinessRounded)))