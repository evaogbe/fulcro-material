(ns ogbe.fulcro.mui.icons.source-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SourceOutlined" :default SourceOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-source-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SourceOutlined)))