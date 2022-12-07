(ns ogbe.fulcro.mui.icons.repeat
  #?(:cljs (:require
            ["@mui/icons-material/Repeat" :default Repeat]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-repeat
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Repeat)))