(ns ogbe.fulcro.mui.icons.preview-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PreviewOutlined" :default PreviewOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-preview-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PreviewOutlined)))