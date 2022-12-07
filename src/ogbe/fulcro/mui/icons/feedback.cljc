(ns ogbe.fulcro.mui.icons.feedback
  #?(:cljs (:require
            ["@mui/icons-material/Feedback" :default Feedback]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-feedback
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Feedback)))