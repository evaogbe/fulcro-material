(ns ogbe.fulcro.mui.icons.attach-file
  #?(:cljs (:require
            ["@mui/icons-material/AttachFile" :default AttachFile]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-attach-file
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AttachFile)))