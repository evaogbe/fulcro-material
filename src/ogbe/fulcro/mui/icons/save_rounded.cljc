(ns ogbe.fulcro.mui.icons.save-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SaveRounded" :default SaveRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-save-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SaveRounded)))