(ns ogbe.fulcro.mui.icons.window-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WindowRounded" :default WindowRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-window-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WindowRounded)))