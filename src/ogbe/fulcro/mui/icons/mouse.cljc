(ns ogbe.fulcro.mui.icons.mouse
  #?(:cljs (:require
            ["@mui/icons-material/Mouse" :default Mouse]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mouse
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Mouse)))