(ns ogbe.fulcro.mui.icons.fingerprint-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FingerprintOutlined" :default FingerprintOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fingerprint-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FingerprintOutlined)))