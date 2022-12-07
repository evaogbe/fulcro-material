(ns ogbe.fulcro.mui.icons.dns-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DnsOutlined" :default DnsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dns-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DnsOutlined)))