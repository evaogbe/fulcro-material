(ns ogbe.fulcro.mui.icons.mark-email-read
  #?(:cljs (:require
            ["@mui/icons-material/MarkEmailRead" :default MarkEmailRead]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mark-email-read
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MarkEmailRead)))