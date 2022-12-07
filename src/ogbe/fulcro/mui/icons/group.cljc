(ns ogbe.fulcro.mui.icons.group
  #?(:cljs (:require
            ["@mui/icons-material/Group" :default Group]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-group
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Group)))