(ns ogbe.fulcro.mui.icons.fax-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FaxRounded" :default FaxRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fax-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FaxRounded)))