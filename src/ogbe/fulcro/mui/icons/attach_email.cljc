(ns ogbe.fulcro.mui.icons.attach-email
  #?(:cljs (:require
            ["@mui/icons-material/AttachEmail" :default AttachEmail]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-attach-email
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AttachEmail)))