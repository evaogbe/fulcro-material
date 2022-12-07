(ns ogbe.fulcro.mui.icons.backspace-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BackspaceRounded" :default BackspaceRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-backspace-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BackspaceRounded)))