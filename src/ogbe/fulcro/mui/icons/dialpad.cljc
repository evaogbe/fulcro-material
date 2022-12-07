(ns ogbe.fulcro.mui.icons.dialpad
  #?(:cljs (:require
            ["@mui/icons-material/Dialpad" :default Dialpad]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dialpad
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Dialpad)))