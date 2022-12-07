(ns ogbe.fulcro.mui.icons.domain-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DomainTwoTone" :default DomainTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-domain-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DomainTwoTone)))