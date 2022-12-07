(ns ogbe.fulcro.mui.icons.computer
  #?(:cljs (:require
            ["@mui/icons-material/Computer" :default Computer]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-computer
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Computer)))