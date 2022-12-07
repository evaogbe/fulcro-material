(ns ogbe.fulcro.mui.icons.border-vertical
  #?(:cljs (:require
            ["@mui/icons-material/BorderVertical" :default BorderVertical]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-vertical
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderVertical)))