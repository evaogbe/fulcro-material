(ns ogbe.fulcro.mui.icons.attachment-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AttachmentRounded" :default AttachmentRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-attachment-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AttachmentRounded)))