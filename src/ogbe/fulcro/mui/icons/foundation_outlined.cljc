(ns ogbe.fulcro.mui.icons.foundation-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FoundationOutlined" :default FoundationOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-foundation-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FoundationOutlined)))