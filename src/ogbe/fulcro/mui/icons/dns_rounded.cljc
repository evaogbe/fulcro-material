(ns ogbe.fulcro.mui.icons.dns-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DnsRounded" :default DnsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dns-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DnsRounded)))