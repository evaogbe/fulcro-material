(ns ogbe.fulcro.mui.icons.verified-outlined
  #?(:cljs (:require
            ["@mui/icons-material/VerifiedOutlined" :default VerifiedOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-verified-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VerifiedOutlined)))