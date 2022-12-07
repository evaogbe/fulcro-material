(ns ogbe.fulcro.mui.icons.looks-two
  #?(:cljs (:require
            ["@mui/icons-material/LooksTwo" :default LooksTwo]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-looks-two
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LooksTwo)))