(ns ogbe.fulcro.mui.icons.domain-disabled-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DomainDisabledRounded" :default DomainDisabledRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-domain-disabled-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DomainDisabledRounded)))