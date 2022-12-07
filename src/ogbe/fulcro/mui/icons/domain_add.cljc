(ns ogbe.fulcro.mui.icons.domain-add
  #?(:cljs (:require
            ["@mui/icons-material/DomainAdd" :default DomainAdd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-domain-add
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DomainAdd)))