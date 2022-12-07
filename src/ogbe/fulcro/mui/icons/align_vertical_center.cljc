(ns ogbe.fulcro.mui.icons.align-vertical-center
  #?(:cljs (:require
            ["@mui/icons-material/AlignVerticalCenter" :default AlignVerticalCenter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-align-vertical-center
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlignVerticalCenter)))