(ns ogbe.fulcro.mui.icons.summarize
  #?(:cljs (:require
            ["@mui/icons-material/Summarize" :default Summarize]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-summarize
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Summarize)))