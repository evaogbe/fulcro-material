(ns ogbe.fulcro.mui.icons.window
  #?(:cljs (:require
            ["@mui/icons-material/Window" :default Window]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-window
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Window)))