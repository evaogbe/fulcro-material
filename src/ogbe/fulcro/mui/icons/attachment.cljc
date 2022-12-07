(ns ogbe.fulcro.mui.icons.attachment
  #?(:cljs (:require
            ["@mui/icons-material/Attachment" :default Attachment]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-attachment
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Attachment)))