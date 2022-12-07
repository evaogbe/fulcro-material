(ns ogbe.fulcro.mui.icons.attachment-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AttachmentSharp" :default AttachmentSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-attachment-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AttachmentSharp)))