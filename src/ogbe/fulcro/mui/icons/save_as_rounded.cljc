(ns ogbe.fulcro.mui.icons.save-as-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SaveAsRounded" :default SaveAsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-save-as-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SaveAsRounded)))