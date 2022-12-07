(ns ogbe.fulcro.mui.icons.wrong-location
  #?(:cljs (:require
            ["@mui/icons-material/WrongLocation" :default WrongLocation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wrong-location
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WrongLocation)))