(ns ogbe.fulcro.mui.icons.mode
  #?(:cljs (:require
            ["@mui/icons-material/Mode" :default Mode]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mode
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Mode)))