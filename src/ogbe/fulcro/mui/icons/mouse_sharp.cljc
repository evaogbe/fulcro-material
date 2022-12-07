(ns ogbe.fulcro.mui.icons.mouse-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MouseSharp" :default MouseSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mouse-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MouseSharp)))