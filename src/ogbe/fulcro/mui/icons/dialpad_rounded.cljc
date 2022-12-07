(ns ogbe.fulcro.mui.icons.dialpad-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DialpadRounded" :default DialpadRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dialpad-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DialpadRounded)))