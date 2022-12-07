(ns ogbe.fulcro.mui.icons.contrast-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ContrastOutlined" :default ContrastOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contrast-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContrastOutlined)))