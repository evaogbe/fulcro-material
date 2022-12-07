(ns ogbe.fulcro.mui.icons.archive
  #?(:cljs (:require
            ["@mui/icons-material/Archive" :default Archive]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-archive
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Archive)))