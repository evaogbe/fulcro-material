(ns ogbe.fulcro.mui.icons.stream-sharp
  #?(:cljs (:require
            ["@mui/icons-material/StreamSharp" :default StreamSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stream-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StreamSharp)))