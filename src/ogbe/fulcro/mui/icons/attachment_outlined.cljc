(ns ogbe.fulcro.mui.icons.attachment-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AttachmentOutlined" :default AttachmentOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-attachment-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AttachmentOutlined)))