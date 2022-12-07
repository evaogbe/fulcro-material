(ns ogbe.fulcro.mui.icons.border-color-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BorderColorRounded" :default BorderColorRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-color-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderColorRounded)))