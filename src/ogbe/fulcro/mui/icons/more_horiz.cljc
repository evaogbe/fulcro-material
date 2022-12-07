(ns ogbe.fulcro.mui.icons.more-horiz
  #?(:cljs (:require
            ["@mui/icons-material/MoreHoriz" :default MoreHoriz]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-more-horiz
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoreHoriz)))