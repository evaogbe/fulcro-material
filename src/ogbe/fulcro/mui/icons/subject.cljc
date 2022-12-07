(ns ogbe.fulcro.mui.icons.subject
  #?(:cljs (:require
            ["@mui/icons-material/Subject" :default Subject]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-subject
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Subject)))