(ns ogbe.fulcro.mui.icons.domain-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DomainRounded" :default DomainRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-domain-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DomainRounded)))