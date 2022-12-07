(ns ogbe.fulcro.mui.icons.mouse-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/MouseTwoTone" :default MouseTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mouse-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MouseTwoTone)))