(ns ogbe.fulcro.mui.icons.mic
  #?(:cljs (:require
            ["@mui/icons-material/Mic" :default Mic]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mic
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Mic)))