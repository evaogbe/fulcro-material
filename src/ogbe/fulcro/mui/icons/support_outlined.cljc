(ns ogbe.fulcro.mui.icons.support-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SupportOutlined" :default SupportOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-support-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SupportOutlined)))